class Solution {
    public int findSpecialInteger(int[] arr) {
      int n=arr.length;
      int div=n/4;
      for(int i=0;i<n-div;i++){
          if(arr[i]==arr[i+div]){
              return arr[i];
          }
      }
      throw new IllegalArgumentException();
    }

}
