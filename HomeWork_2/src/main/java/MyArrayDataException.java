class MyArrayDataException extends Exception {
    MyArrayDataException(int x, int y) {
        super("Ошибка в массиве: элемент " + (y + 1) + " в строке " + (x + 1));
    }
}

