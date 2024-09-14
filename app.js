// Get input fields for temperature conversions
let celsiusInput = document.querySelector('#celsius > input');
let fahrenheitInput = document.querySelector('#fahrenheit > input');
let kelvinInput = document.querySelector('#kelvin > input');

// Get the clear button
let clearButton = document.querySelector('.button button');

// Function to round numbers to 2 decimal places
function roundNumber(number) {
    return Math.round(number * 100) / 100;
}

// Celsius to Fahrenheit and Kelvin
celsiusInput.addEventListener('input', function() {
    let cTemp = parseFloat(celsiusInput.value);
    let fTemp = (cTemp * (9 / 5)) + 32;
    let kTemp = cTemp + 273.15;

    fahrenheitInput.value = roundNumber(fTemp);
    kelvinInput.value = roundNumber(kTemp);
});

// Fahrenheit to Celsius and Kelvin
fahrenheitInput.addEventListener('input', function() {
    let fTemp = parseFloat(fahrenheitInput.value);
    let cTemp = (fTemp - 32) * (5 / 9);
    let kTemp = (fTemp - 32) * (5 / 9) + 273.15;

    celsiusInput.value = roundNumber(cTemp);
    kelvinInput.value = roundNumber(kTemp);
});

// Kelvin to Celsius and Fahrenheit
kelvinInput.addEventListener('input', function() {
    let kTemp = parseFloat(kelvinInput.value);
    let cTemp = kTemp - 273.15;
    let fTemp = (kTemp - 273.15) * (9 / 5) + 32;

    celsiusInput.value = roundNumber(cTemp);
    fahrenheitInput.value = roundNumber(fTemp);
});

// Clear all fields when the clear button is clicked
clearButton.addEventListener('click', () => {
    celsiusInput.value = "";
    fahrenheitInput.value = "";
    kelvinInput.value = "";
});
