package HomeWorks.HomeWork_5;

public class AppData {

        private final String[] header = {"Title one", "Title two", "Title three"};
        private final int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        private final int[][] data2 = {{11, 22, 33}, {44, 55, 66}, {77, 88, 99}};
        private final int[][] data3 = {{111, 222, 333}, {444, 555, 666}, {777, 888, 999}};
        private final int[][] data4 = {{1111, 2222, 3333}, {4444, 5555, 6666}, {7777, 8888, 9999}};

        public AppData() {}
        public String[] getHeader() {
                return header;
        }
        public int[][] getData() {
                return data;
        }
        public int[][] getData2() {
                return data2;
        }
        public int[][] getData3() {
                return data3;
        }
        public int[][] getData4() {
                return data4;
        }
}
