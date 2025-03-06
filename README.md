# Skincare Review Summarizer

A web application that uses NLP to summarize skincare product reviews, built with Java (data prep), Python (NLP modeling), and JavaScript (front-end), deployed to the cloud. This project showcases data science skills and project management for retail analytics.

## Goals
- Apply transformer-based NLP to summarize customer reviews.
- Integrate multiple languages: Java, Python, JavaScript.
- Deploy a functional app to demonstrate cloud skills.
- Document the process to reflect systematic project execution.

## Tech Stack
- **Java**: Data preprocessing (`Jsoup` for scraping, if applicable).
- **Python**: NLP modeling (`pandas`, `transformers`, `torch`).
- **JavaScript**: Web interface (Node.js, Express).
- **Deployment**: Docker, Heroku.

## Project Plan
### Phase 1: Planning & Data Prep (March 5–9, 2025)
- Tasks: Set up repo, collect skincare review data, preprocess with Java.
- Deliverable: `cleaned_reviews.csv`.

### Phase 2: NLP Model Development (March 10–16, 2025)
- Tasks: Train a transformer model to summarize reviews.
- Deliverable: `summarized_reviews.csv`, `summarizer.py`.

### Phase 3: Web App & Deployment (March 17–25, 2025)
- Tasks: Build a JavaScript front-end, deploy with Docker to Heroku.
- Deliverable: Live app URL (e.g., `https://skincare-summarizer-app.herokuapp.com`).

## Progress
- [x] Repo initialized (March 4, 2025).
- [x] Practiced GitHub basics (March 4, 2025).
- [x] Data collected and combined (March 4, 2025).
- [x] Data preprocessed with Java (March 5, 2025).

## Data
- **Source**: Sephora Products and Skincare Reviews ([Kaggle](https://www.kaggle.com/datasets/nadyinky/sephora-products-and-skincare-reviews)).
- **Details**: Merged 5 files (e.g., `reviews*.csv`) into `raw_reviews.csv` locally using `combine_reviews.py`.
- **Columns**: `product_id`, `review_text`, `rating`, `date`, etc. (~X rows, all columns kept).
- **Merged**: `raw_reviews.csv` (~1.1M rows, local).
- **Cleaned**: `cleaned_reviews.csv` (~1,099,052 rows, local, review_text in column J cleaned).

## Challenges & Solutions
*(To be updated as project progresses.)*

## Next Steps
- Collect dataset by March 7, 2025.
- Complete Java preprocessing by March 9, 2025.
