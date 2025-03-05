import pandas as pd
import glob

#find all reviews files
review_files=glob.glob("reviews*.csv")
print(f"Found files: {review_files}")

#Read and combine them
dfs=[]
for file in review_files:
    df=pd.read_csv(file)
    dfs.append(df)
#ignore_index=True: dedup the index number
combined=pd.concat(dfs, ignore_index=True)

#Keep all columns, just drop rows with missing review_text
combined=combined.dropna(subset=["review_text"])

#Save to raw_reviews.csv
#index=false: remove index in the csv file
combined.to_csv("raw_reviews.csv", index=False)
print(f"Save{len(combined)} row to raw_reviews.csv")

# check combined file
combined2 = pd.read_csv("raw_reviews.csv")
print(f"Total rows: {len(combined)}")
print("First 5 rows:")
print(combined.head())
print("Last 5 rows:")
print(combined.tail())
print("Columns:", combined.columns.tolist())