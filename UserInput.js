const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Enter the first number: ", (num1) => {
    rl.question("Enter the second number: ", (num2) => {
        num1 = Number(num1);
        num2 = Number(num2);
        
        console.log("Addition:", num1 + num2);
        console.log("Subtraction:", num1 - num2);
        console.log("Multiplication:", num1 * num2);
        console.log("Division:", num1 / num2);
        console.log("Modulus:", num1 % num2);

        rl.close();
    });
});
