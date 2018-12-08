public void sortTest() {
        int arr[] = {13, 16, 14,13, 18, 14,13, 16, 14};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        for (int s : arr) {
            System.out.print(s+",");
        }
    }
