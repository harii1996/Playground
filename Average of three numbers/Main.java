#include<stdio.h>
int main()
{
 int n1,n2,n3,avg,sum,total;
  scanf("%d%d%d",&n1,&n2,&n3);
  sum=n1+n2+n3;
  total=3;
  avg=sum/total;
  printf("%d",avg);
  return 0;
}