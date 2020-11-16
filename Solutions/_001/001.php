<?php

$divisors = array(3, 5);
$multiples_of_divisors = array();

for ($i = 1, $n = 1000; $i < $n; $i++) {
    foreach ($divisors as $divisor) {
        if (0 == $i % $divisor) {
            $multiples_of_divisors[] = $i;
            break;
        }
    }
}

$sum_of_multiples = array_sum($multiples_of_divisors);

print "The solution to Euler Project is $sum_of_multiples.
