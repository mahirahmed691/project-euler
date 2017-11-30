function prime(num) {
    let factors = [];
    for (let i = 2; i <= num; i++) {
        while (num % i === 0) {
            factors.push(i);
            num /= i;
        }
    }
    return factors.pop();
}
console.log(prime(600851475143));
