/*
int c[][],x; -> int c[][]; int x;


int [][]c,x; -> int c[][]; int x[][];


int x[][] = {
	{0},
	{1, 2},
	{3, 4, 5},
	{6, 7, 8, 9}
};


int x[][] = new int[4][];
for (int i = 0; i < 4; i++) {
	x[i] = new int[i + 1];
	for (int j = 0; j <= i; j++) {
		x[i][j] = (i) * (i + 1) / 2 + j;
	}
}

int x[][] = new int[4][];
x[0] = new int[1];
x[1] = new int[2];
x[2] = new int[3];
x[3] = new int[4];
x[0][0] = 0;
x[1][0] = 1; x[1][1] = 2;
x[2][0] = 3; x[2][1] = 4; x[2][2] = 5;
x[3][0] = 6; x[3][1] = 7; x[3][2] = 8; x[3][3] = 9;
*/