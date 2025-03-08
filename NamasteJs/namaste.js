
// function x(){
//     var a = 7;
//     return function y(){
//         console.log(a);
//     }
// }

// var result = x();
// result();
// setTimeout(function(){
//     console.log("timer");
// });

// function x(y){
//     console.log("x");
//     y();
// }
// x(function y(){
//     console.log('y');
// });
// function attachEventListeners(){
// let count = 0;
// document.getElementById("clickme")
// .addEventListener('click',function xyz(){
//     console.log("clicked", count);
// });
// }
// attachEventListeners();

// var newtext = document.getElementById("one");
// console.log(newtext.textContent);


// function change(){
//     newtext.textContent = "bye world";
// }

// function totalfun(){
//     let number1 = document.getElementById("num1");
//     let number2 = document.getElementById("num2");
//     let total = Number(number1.value)+Number(number2.value);
//     // result.textContent = total;
//     document.getElementById("result").innerHTML = total;
//  }

//guess number 
// var number1 = document.getElementById("num");
// let numValue = number1.value;
// let randomValue = Math.floor(Math.random()*10)+1
// var score = 10;
// function guessNumber(){
//     if(numValue == randomValue){
//         document.getElementById("resultTag").textContent = "Right";
//         alert("You are won");
//     }
//     else{
//         document.getElementById("resultTag").textContent = "Wrong";
//         score = score-1;
//         document.getElementById("scoreTag").textContent = "Score : " + score;

//onkeyup
// var word = document.getElementById("inputField");
// function textCopy(){

//     document.getElementById("para").textContent = word.value;
// }

//append method to add new tag
// var div = document.getElementById("text")

// function addText(){
//     var listItems = document.createElement("h1")
//     listItems.textContent = "Hello";
//     div.append(listItems);
// }

//change color of button when clicked

// function changeColor(){
//     document.getElementById("btn").style.backgroundColor = "red";
// }

//event target
// var h1 = document.getElementById("name");
// function change(event){
//     h1.textContent = event.target.textContent;
    
// }

//remove element by target and remove method
function deleteTag(event){
    event.target.remove();
}