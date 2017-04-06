public class Main {
    public static void main(String[] args) {
        // белый цвет - ложь, черный - истинна. Массив - ряд людей в шляпах
        // Если количество черных шапок(blackHatCount) четное то первый человек говорит "черная" вне зависимости какая шляпа на нем,
        // если количество черных шапок нечетное он говорит "белая"
        int blackHatCount = 0;
        int internalCount = 0;
        boolean[] bool = {false, true, false, true, false, true, false, true, true, true, false, false, true};
        int arr[] = new int [bool.length];
        for (int i = 1; i < bool.length; i++) {
            if (bool[i]) {
                blackHatCount++;
            }
            arr[0]= blackHatCount;
        }
        if (blackHatCount % 2 == 0) {
           System.out.println("черная");
            for (int l = 1; l < bool.length; l++){
                for (int j = l + 1; j < bool.length; j++) {
                    if (bool[j]){
                        internalCount++;
                    }
                }
                for (int i = l; i < bool.length; i++) {
                    arr[i] = internalCount;
                }
                internalCount = 0;
            }
            for (int v = 0; v < bool.length; v++) {
                    if (arr[v] == arr[v + 1]) {
                        System.out.println("белая");
                    } else {
                        System.out.println("черная");
                    }
                }
        }else{
            System.out.println("белая");
            for (int l = 1; l < bool.length; l++){
                for (int j = l + 1; j < bool.length; j++) {
                    if (bool[j]){
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
