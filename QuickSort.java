public class QuickSort {
public static void main(String[] args) {
int[] arr = {1,11,21,31,41,51,61,71,81,91};
quick(arr);
for (int i : arr) {
System.out.print(" "+i);
}
}

private static void quick(int[] arr) {
if (arr.length > 0) {
quickSort(arr,0,arr.length-1);
}
}

private static void quickSort(int[] arr, int head, int foot){
if (head < foot) {
int middle = getMiddle(arr, head, foot);
quickSort(arr,0,middle-1);
quickSort(arr,middle+1,foot);
}
}

private static int getMiddle(int[] arr, int head, int foot) {
int temp = arr[head];
while (foot > head) {
while(foot > head && arr[foot]>=temp){
foot--;
}
arr[head] = arr[foot];
while(foot > head && arr[head]<=temp){
head++;
}
arr[foot] = arr[head];
}
arr[head] = temp;
return head;
}
}
