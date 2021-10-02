#include<iostream>
#include<stdlib.h>
#include<string>
#include<fstream>
using namespace std;
class  A // function overloding
{
    protected :
    int a[3];
    public:
    void sum()
    {
        int t=0;
        cout<<"Enter there numbers for sum :"<<endl;
        for(int i=0;i<3;i++)
        {
            cin>>a[i];
        }
        cout<<"Sum : ";
        for(int i=0;i<3;i++)
        {
            t+=a[i];
        }
        cout<<t<<endl;
    }
    void sum(int x,int y,int z)
    {
        int t=0;
        a[0]=x;
        a[1]=y;
        a[2]=z;
        cout<<"Sum : ";
        for(int i=0;i<3;i++)
        {
            t+=a[i];
        }
        cout<<t<<endl;
    }
    int sum1()
    {
        int t=0;
        cout<<"Enter there numbers for sum :"<<endl;
        for(int i=0;i<3;i++)
        {
            cin>>a[i];
        }
        cout<<"Sum : ";
        for(int i=0;i<3;i++)
        {
            t+=a[i];
        }
        return t;
    }
    int sum1(int x,int y,int z)
    {   
        int t=0;
        a[0]=x;
        a[1]=y;
        a[2]=z;
        for(int i=0;i<3;i++)
        {
            t+=a[i];
        }
        cout<<"Sum : ";
        return t;
    }
    friend void f(A);
    };
class B : public A //single level in
{
    public:
     int sub(int x,int b,int c,int d)
     {
         a[0]=b;
         a[1]=c;
         a[2]=d;
         cout<<"Sub : ";
         for(int i=0;i<3;i++)
         {
             x-=a[i];
         }
         return x;
     }
};
class c: public B //multilevel in
{ public:
    void mul(int x,int y, int z)
    { 
        int t=1;
        a[0]=x;
        a[1]=y;
        a[2]=z;
        cout<<"Mul : ";
        for(int i=0;i<3;i++)
        {
            t*=a[i];
        } 
        cout<<t;
    }

};
class E
{
    public:
    void fun()
    {
        cout<<"I Am a demo class";
    }
};
class D: public A,public E
{
    public:
    D()
    {
        cout<<"I am constructor "<<endl;
    }
    ~D()
    {
        cout<<"I am distuctur "<<endl;
    }
};

class expansion 
{
	int a,b;
	void divide()
	{
		cout<<"enter the value of a and b";
		cin>>a>>b;
		try
		{
			if(b!=0)
			cout<<"division:"<<a/b;
			else throw(b);
		}
		catch(int x)
		{
			cout<<"can't division by zero";
		}
		}
};
void f(A o)
{
    cout<<"i am friend of class A";
}
int main()
{
    A obj;
   // obj.sum();
   // obj.sum(1,2,3);
   // int a=obj.sum1();
   // cout<<a;
  // cout<<obj.sum1(4,5,89);
 // B o;
 //cout<<o.sub(40,5,12,3);
 // c poth;
 //poth.mul(2,3,4);
  //  D con;
  E ajay;
  f(obj);
    return 0;
}   
