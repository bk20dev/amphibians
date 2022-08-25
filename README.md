# Amphibians

Learn about different amphibians

## How it works

On startup, the app fetches a list of amphibians and displays them on the main page. You can select
one to see more details about the selected amphibian. If you're offline, the app will display an
error.

![amphibians_app](https://user-images.githubusercontent.com/60577942/186660731-74a87d29-7f54-4367-a354-4b0dd055521b.gif)

## Used technologies

- **Retrofit**
- **Coil**
- Moshi

---

- Navigation Component
- Data Binding
- Binding Adapters
- ViewModel, LiveData
- Fragments

## Running the app

To build the app, make sure you have **Android Studio** installed.

1. Get the code - either clone this repository or download and unpack the *.zip* archive
2. Open the project in Android Studio **File → Open**
3. Build and run the application by clicking on the **Run** button

## Notice

The provided API does **not** contain images. If you wish to test the app yourself, you might want
to create a simple JSON server (e.g. use Firebase RTDB) and import
the [_demo_amphibians_data.json](_demo_amphibians_data.json) file.
