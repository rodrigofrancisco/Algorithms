int[] mutateTheArray(int n, int[] a) {
    int b[] = new int[n];
    for(int i=0; i < n; i++) {
        b[i] = el(n,a,i-1) + el(n,a,i) + el(n,a,i+1);
    }
    return b;
}

int el(int n, int[] a, int i) {
    if(i < 0 ) return 0;
    else if( i >= n ) return 0;
    else return  a[i];
}
