# The Quiz App

**Quiz App** is an Android application that allows users to answer books related questions fetched from a local database. This project uses a MySQL database and a custom API built in PHP to transform data into JSON format. Using **Retrofit**, the app fetches data from the API and displays it to the user through a clean and simple interface.

## Features

- **Local Database**: The MySQL database contains a table of math questions, with each record representing a multiple-choice question.
- **Custom API**: A PHP API retrieves the questions from the database and transforms them into JSON responses.
- **Retrofit for Networking**: Retrofit is used to retrieve the JSON data and convert it into **Plain Old Java Objects** (POJOs) for display in the UI.
- **MVVM Architecture**: The app follows the Model-View-ViewModel (MVVM) architecture pattern for a clear separation of business logic and presentation.
- **Data Binding**: Uses the Data Binding Library to streamline interactions between the UI and data.
- **Result Display**: At the end of the quiz, users are directed to a results screen that displays their score and the total number of questions.

## Network Security

The app uses a `network-security-config` file that allows cleartext traffic for development purposes, ensuring compatibility with non-HTTPS connections. This configuration file also specifies trusted certificates and enhances the app's network security structure, which is crucial for handling data securely during API interactions.


## Application Structure

1. **MySQL Database**: A local database created in MySQL, containing a table of questions.
2. **PHP API**: A custom API built in PHP to retrieve questions from the database and convert them to JSON format.
3. **Android App**: The Android application uses Retrofit to integrate the JSON response, displayed interactively to the user.

## How to Use the App

1. **Set Up the Database**: Create a MySQL database with a table of questions. Ensure the database structure is compatible with the API’s requirements.
2. **Configure PHP API**: Use the PHP file to create an API that retrieves questions from the database and converts them to JSON.
3. **Integrate with the App**: In the Android app, use Retrofit to access the API and transform JSON responses into Java objects for display in the UI.

## Technologies Used

- **MySQL**: For managing the local database of questions.
- **PHP**: To build the API that transforms data into JSON.
- **Retrofit**: To retrieve and handle JSON responses.
- **MVVM (Model-View-ViewModel)**: Chosen architecture to separate app logic and data presentation.
- **Data Binding**: To link UI elements directly with backend data.

## How to Run the Project

1. Clone this repository:
   ```bash
   git clone https://github.com/yourusername/QuizApp.git
