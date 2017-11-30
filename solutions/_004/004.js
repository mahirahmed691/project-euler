function palindromic() {
    let max = 0;
    for(let i = 999; i > 99; i--) {
        for(let k = 999; k > 99; k--) {
            let n = i * k;
            let s = '' + n;
            if (s === s.split("").reverse().join("") && n > max) {
                max = n;
            }
        }
    }
    return max;
}
console.log(palindromic());

