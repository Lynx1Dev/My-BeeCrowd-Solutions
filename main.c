#include <stdio.h>
using namespace std

int main() {
    float A, B, M;
    
    scanf("%.1f", &A);
    scanf("%.1f", &B);
    
    M = ( ((A * 3.5) + (B * 7.5)) /11 );
    
    printf("MEDIA = %.5f\n", M);
    
    return 0;
}