wc -l lab0/**/*e > ./tmp/result 2> ./tmp/errors
ls -laRut lab0 2> /dev/null | grep -E '^-|^l' | head -n 4
grep -n -v "ron" lab0/cubchoo 2> /dev/null
cat lab0/**/*a 2> /dev/null | sort | grep -n ""
ls -1Rt lab0 2> /dev/null | grep "^m"
ls -laR lab0 2>&1 | grep "wo" | sort -n -k2 | tail -n 4