    Task

Write a function that accepts fight string consists of only small letters and
return who wins the fight. When the left side wins return "Left side wins!",
when the right side wins return "Right side wins!", in other case return "Let's fight again!".

The left side letters and their power:
w - 4
p - 3
b - 2
s - 1
t - 0 (it's priest)

The right side letters and their power:
m - 4
q - 3
d - 2
z - 1
j - 0 (it's priest)

The other letters don't have power and are only victims.
The priest units t and j change the adjacent letters from hostile letters to
friendly letters with the same power.

mtq => wtp
wjs => mjz
A letter with adjacent letters j and t is not converted i.e.:

tmj => tmj
jzt => jzt
The priests (j and t) do not convert the other priests ( jt => jt ).

Example
Priests.whoWins("z")         //=>  "z"  => "Right side wins!"
Priests.whoWins("tz")        //=>  "ts" => "Left side wins!"
Priests.whoWins("jz")        //=>  "jz" => "Right side wins!"
Priests.whoWins("zt")        //=>  "st" => "Left side wins!"
Priests.whoWins("azt")       //=> "ast" => "Left side wins!"
Priests.whoWins("tzj")       //=> "tzj" => "Right side wins!" 