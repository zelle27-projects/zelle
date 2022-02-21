#!/bin/bash
# this is a switch cas script also remember to pass an argument to run
echo "please only enter number 1 through 5 as your options"
case $1 in 
1)
echo "you have chosen running"
;;
2)
echo "will you like to swim"
;;
3)
echo "your preference is basketball"
;;
4)
echo "please enter a desired sport"
read sport
echo "thank you, you have chosen $sport" > $sport
;;
5)
echo "thank you for picking a choice"
;;
*)
echo "you have not pick any sport, please enter between 1 to 4 to pick"
;;
esac
echo "we look forward to make you a pro"
