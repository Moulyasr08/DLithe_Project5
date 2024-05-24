1. Use Case: Electricity Bill Generation.
Write a code to take the service Number, previous reading, and current reading as input and then
find the number of units consumed, then calculate the cost of electricity as follows.
If units consumed is <100 then cost @Rs.1/per unit.
Else if units consumed <150 and >=100 then cost @Rs.1.5 per unit.
Else if unit consumed <200 and >=150 then cost @Rs.2 per unit.
Else if >=200 units then cost @Rs.2.5 per unit.
Now calculate 5% CGST on the price and 15% SGST then find the total amount to pay.
Display all the details on the output screen.


2. Use Case: Bus Ticket Generation
Write a code to take boarding stop and destination stop values as integers, the number of adult
passengers, and a number of child passengers as integers. Then find the number of stops the
passengers are travelling. Calculate Rs.10 per adult passenger per stop. Calculate Rs.5 per child
passenger and then find the cost of the ticket( including adult ticket cost and child ticket cost).
No apply an offer as follows to the ticket.
If No.of adult passengers are >=5 then give a discount of 20% of cost of the ticket.
Else If No.of adult passengers are 4 then give a discount of 15% of cost of the ticket.
Else If No.of adult passengers are 3 then give a discount of 10% of cost of the ticket.
Else If No.of adult passengers are 2 then give a discount of 5% of cost of the ticket.
Else If No.of adult passengers are 1 then give a discount of 0% of cost of the ticket.
Then calculate a 10% tax on the cost of the ticket.
Then find the total price of the ticket including tax.
Then display all the data on the output screen.


4. Use Case: ATM Withdraw.
You are given an Initial account balance of 10000, an ATM pin as 1234, and Cash available in the
machine as 8000. Then Write a code to perform the withdraw operation.
Read the Pin from the use and verify whether it is correct or not.
If correct, read the amount ‘X’ to withdraw.
Check given X is a valid amount or not (multiple of 100).
If X is a valid amount, Check X<=balance.
If Yes, then check X amount is available in the ATM machine or not.
If cash is available then print the updated balance.
Else print Transaction failed.
