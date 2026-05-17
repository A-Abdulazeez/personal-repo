const { add,subtraction } = require("./SayHello")

test("test addition of two positive numbers", () =>{
let firstNumber = 1
let secondNumber = 2
expect(add(firstNumber,secondNumber)).toBe(3)

})

test("test addition of a positive number and a negative works accurately", () =>{
let firstNumber = 10
let secondNumber = -5
expect(add(firstNumber,secondNumber)).toBe(5)

})

test("test addition of a negative number and a negative works accurately", () =>{
let firstNumber = -5
let secondNumber = -5
expect(add(firstNumber,secondNumber)).toBe(-10)

})

test("test addition of two negativ numbers returns negative works", () =>{
let firstNumber = -5
let secondNumber = -5
expect(add(firstNumber,secondNumber)).toBe(-10)

})

test("test subtraction of two negative numbers works", () =>{
let firstNumber = -2
let secondNumber = -1
expect(subtraction(firstNumber,secondNumber)).toBe(-1)

})

test("test subtraction of two positive numbers works", () =>{
let firstNumber = 10
let secondNumber = 5
expect(subtraction(firstNumber,secondNumber)).toBe(5)

})

test("test subtraction of two negative numbers returns positive number works", () =>{
let firstNumber = -8
let secondNumber = -8
expect(subtraction(firstNumber,secondNumber)).toBe(0)

})

test("test subtraction of two negative numbers works", () =>{
let firstNumber = -8
let secondNumber = -3
expect(subtraction(firstNumber,secondNumber)).toBe(-5)

})