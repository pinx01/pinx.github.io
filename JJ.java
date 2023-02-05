// Get the button element by class name
//var orderButton = document.querySelector(".KFC");

// Add a click event listener to the button
//orderButton.addEventListener("click", function() {
  // Show an alert when the button is clicked
 // alert("Your order has been placed successfully!");
//});

  //const buttons = document.querySelectorAll(".submitbtn");
 // buttons.forEach(button => {
   // button.addEventListener("click", function() {
    //  alert("You have ordered successfully!");
    //});
  //});
  const buttons = document.querySelectorAll('.submitbtn');
buttons.forEach(button => {
  button.addEventListener('click', () => {
    alert("You have ordered successfully!");
  });
});


 