'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}

function getLetter(s) {
    const c = s.toUpperCase().charAt(0);
    switch(c){
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
            return 'A';
        case 'B':
        case 'C':
        case 'D':
        case 'F':
        case 'G':
            return 'B';
        case 'H':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
            return 'C';
        case 'N':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
            return 'D';
        default:
            return null;
    }
}


function main() {
    const s = readLine();
    
    console.log(getLetter(s));
}