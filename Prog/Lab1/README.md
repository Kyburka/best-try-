55435 вариант.
# Задание

1. Создать одномерный массив e типа double. Заполнить его четными числами от 4 до 16 включительно в порядке возрастания.
2. Создать одномерный массив x типа double. Заполнить его 19-ю случайными числами в диапазоне от -13.0 до 13.0.
3. Создать двумерный массив e размером 7x19. Вычислить его элементы по следующей формуле (где $x = x[j]$):
  - если $e[i] = 12$, то $e_{1}[i][j] =\cos(\ln(\arccos(\frac{x}{26})))$;
  - если $e[i] \in \{8, 14, 16\}$, то $e_{1}[i][j] =\ln(e^{\arctan(\cos(x))})$;
  - для остальных значений $e[i]: e_{1}[i][j] =\arctan(e^{\sqrt[3]{-(\frac{(2*|x|)^{x}}{\pi})^{2}}})$
4. Напечатать полученный в результате массив в формате с четырьмя знаками после запятой.

# Код

```java
import java.util.*;  
public class Main {  
    static final int E_LENGTH = 7;  
    static final int X_LENGTH = 19;  
    static final int MIN_RANDOM = -13;  
    static final int MAX_RANDOM = 13;  
    static final int E1_ROWS = 7;  
    static final int E1_COLS = 19;  
    public static void main(String[] args) {  
        int[] e = new int[E_LENGTH];  
        Random random = new Random();  
        int start = 4, counter = 0;  
        while(start <= 16){  
            if(start%2 == 0) {  
                e[counter] = start;  
                counter++;  
            }  
            start++;  
        }  
        double[] x = new double[X_LENGTH];  
        for(int i = 0; i<X_LENGTH; i++) {  
            x[i] = (MAX_RANDOM-MIN_RANDOM)*random.nextDouble()+MIN_RANDOM;  
        }  
        double[][] e1 = calculateMatrix(new double[E1_ROWS][E1_COLS], e, x);  
        for(int i = 0; i<E1_ROWS; i++) {  
            for(int j = 0; j<E1_COLS; j++) {  
                System.out.printf("%-10.4f", e1[i][j]);  
            }  
            System.out.println();  
        }  
    }  
    public static double[][] calculateMatrix(double[][] e1, int[] e, double[] x) {  
        for(int i = 0; i<e1.length; i++) {  
            for(int j = 0;j<e1[0].length; j++) {  
                if(e[i] == 12) {  
                    e1[i][j] = Math.cos(Math.log(Math.acos(x[j]/26.0)));  
                }  
                else if((e[i] == 8) || (e[i] == 14) || (e[i] == 16)) {  
                    e1[i][j] = Math.log(Math.exp(Math.atan(Math.cos(x[j]))));  
                }  
                else {  
                    e1[i][j] = Math.atan(Math.exp(Math.pow((-Math.pow(((Math.pow((2*Math.abs(x[j])), x[j]))/(Math.PI)), 2.0)), (1.0/3.0))));  
                }  
            }  
        }  
        return e1;  
    }  
}
```

# Результаты вычислений

| Кол. 1  | Кол. 2  | Кол. 3 | Кол. 4  | Кол. 5 | Кол. 6  | Кол. 7  | Кол. 8 | Кол. 9  | Кол. 10 | Кол. 11 | Кол. 12 | Кол. 13 | Кол. 14 | Кол. 15 | Кол. 16 | Кол. 17 | Кол. 18 | Кол. 19 |
| :------ | :------ | :----- | :------ | :----- | :------ | :------ | :----- | :------ | :------ | :------ | :------ | :------ | :------ | :------ | :------ | :------ | :------ | :------ |
| NaN     | NaN     | NaN    | NaN     | NaN    | NaN     | NaN     | NaN    | NaN     | NaN     | NaN     | NaN     | NaN     | NaN     | NaN     | NaN     | NaN     | NaN     | NaN     |
| NaN     | NaN     | NaN    | NaN     | NaN    | NaN     | NaN     | NaN    | NaN     | NaN     | NaN     | NaN     | NaN     | NaN     | NaN     | NaN     | NaN     | NaN     | NaN     |
| -0,2558 | -0,2336 | 0,6017 | -0,6462 | 0,0878 | -0,7184 | -0,4294 | 0,5640 | -0,7362 | -0,7114 | 0,1060  | 0,7852  | 0,4024  | -0,7850 | 0,7783  | 0,3446  | 0,3196  | -0,5290 | -0,6603 |
| NaN     | NaN     | NaN    | NaN     | NaN    | NaN     | NaN     | NaN    | NaN     | NaN     | NaN     | NaN     | NaN     | NaN     | NaN     | NaN     | NaN     | NaN     | NaN     |
| 0,7704  | 0,8050  | 0,9669 | 0,9877  | 0,9720 | 0,9802  | 0,8020  | 0,9527 | 0,9276  | 0,8587  | 0,8094  | 0,8272  | 0,8136  | 0,9837  | 0,9589  | 0,9499  | 0,8123  | 0,9889  | 0,8727  |
| -0,2558 | -0,2336 | 0,6017 | -0,6462 | 0,0878 | -0,7184 | -0,4294 | 0,5640 | -0,7362 | -0,7114 | 0,1060  | 0,7852  | 0,4024  | -0,7850 | 0,7783  | 0,3446  | 0,3196  | -0,5290 | -0,6603 |
| -0,2558 | -0,2336 | 0,6017 | -0,6462 | 0,0878 | -0,7184 | -0,4294 | 0,5640 | -0,7362 | -0,7114 | 0,1060  | 0,7852  | 0,4024  | -0,7850 | 0,7783  | 0,3446  | 0,3196  | -0,5290 | -0,6603 |

# Вывод

В данной работе я научился работать с библиотекой $java.util.Random$, а также прочитал конвенции кода Java. Научился собирать JAR, а также отправлять их на сервера используя $SCP$.

# Компилирование и перевод в JAR и запуск

Компилируем наш файл $main.java$ в git bash командой:
```bash
javac --release 17 main.java
```

Далее, переводим $Main.class$ в JAR:
```bash
jar cfe Main.jar Main *.class
```

Отправляем на Гелиос через $scp$:
```bash
scp -P 2222 Main.jar s501591@se.ifmo.ru:~/
#Вводим пароль
```

Запускаем JAR на Гелиосе:
```bash
java -jar Main.jar
```
