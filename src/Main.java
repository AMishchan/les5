public class Main {
    public static void main(String[] args) {
        // белый цвет - ложь, черный - истинна. Массив bool - ряд людей в шляпах
        // Если количество черных шапок(blackHatCount) четное то первый человек говорит "черная" вне зависимости какая шляпа на нем,
        // если количество черных шапок нечетное он говорит "белая"
        int blackHatCount = 0;
        int internalCount = 0;
        boolean[] bool = {false, true, false, true, false, true, false, true, true, true, false, false, true};
        int arr[] = new int[bool.length];
        //записываем количество черных шапок в blackHatCount
        for (int i = 1; i < bool.length; i++) {
            if (bool[i]) {
                blackHatCount++;
            }
            //присваиваем blackHatCount первому элементу массива arr
            arr[0] = blackHatCount;
        }
        //если blackHatCount четный выполняется код после if(количество черных шапок четное)
        if (blackHatCount % 2 == 0) {
            System.out.println("черная");
            //перебираем массив bool каждый раз начиная со следующего элемента
            for (int l = 1; l < bool.length; l++) {
                for (int j = l + 1; j < bool.length; j++) {
                    if (bool[j]) {
                        internalCount++;
                    }
                }
                //каждый результат internalCount записываем в массив arr
                for (int i = l; i < bool.length; i++) {
                    arr[i] = internalCount;
                }
                // сбраваем internalCount для следующего прохода по массиву bool
                internalCount = 0;
            }
            //перебираем массив arr и сравниваем каждое значение со следующим,
            //если значения одинаковы  это означает что количество черных шапок
            //не изменилось следовательно текущий элемент массива(человек в шапке)
            //имеет на голове белую шапку, если значения отличаются - черную
            for (int v = 0; v < bool.length; v++) {
                if (arr[v] == arr[v + 1]) {
                    System.out.println("белая");
                } else {
                    System.out.println("черная");
                }
            }
        } else
        //предшествующая процедура если количество черных шапок нечетное и
        //первый человек говорит "белая"
        {
            System.out.println("белая");
            for (int l = 1; l < bool.length; l++) {
                for (int j = l + 1; j < bool.length; j++) {
                    if (bool[j]) {
                        internalCount++;
                    }
                }
                for (int i = l; i < bool.length; i++) {
                    arr[i] = internalCount;
                }
                internalCount = 0;
            }
            for (int v = 0; v < bool.length - 1; v++) {
                if (arr[v] == arr[v + 1]) {
                    System.out.println("белая");
                } else {
                    System.out.println("черная");
                }
            }
        }
    }
}
