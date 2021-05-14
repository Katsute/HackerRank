#include<bits/stdc++.h>

using namespace std;

class Box {

    private:
        long l, b, h;

    public:
        Box() : Box(0, 0, 0){ };
        Box(int l, int b, int h){
            this->l = l;
            this->b = b;
            this->h = h;
        };
        Box(Box& b) : Box(b.l, b.b, b.h){ };

        int getLength() const { return l; }
        int getBreadth() const { return b; }
        int getHeight() const { return h; }
        long long CalculateVolume() const { return l * b * h; }

        bool operator < (Box& b){
            return
                l < b.l ||
                (this->b < b.b && this->l == b.l) ||
                (this->h < b.h && this->b == b.b && this->h == b.h);
        }

        friend ostream& operator<<(ostream& out, Box& B){
            out << B.l << " " << B.b << " " << B.h;
            return out;
        }

};

void check2()
{
	int n;
	cin>>n;
	Box temp;
	for(int i=0;i<n;i++)
	{
		int type;
		cin>>type;
		if(type ==1)
		{
			cout<<temp<<endl;
		}
		if(type == 2)
		{
			int l,b,h;
			cin>>l>>b>>h;
			Box NewBox(l,b,h);
			temp=NewBox;
			cout<<temp<<endl;
		}
		if(type==3)
		{
			int l,b,h;
			cin>>l>>b>>h;
			Box NewBox(l,b,h);
			if(NewBox<temp)
			{
				cout<<"Lesser\n";
			}
			else
			{
				cout<<"Greater\n";
			}
		}
		if(type==4)
		{
			cout<<temp.CalculateVolume()<<endl;
		}
		if(type==5)
		{
			Box NewBox(temp);
			cout<<NewBox<<endl;
		}

	}
}

int main()
{
	check2();
}