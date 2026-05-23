class Solution {
public:
    double myPow(double x, int n) {
        if (n == 0 || x == 1) return 1.0;
        if (x == 0) return 0.0;
        if (x == -1 && n % 2 == 0) return 1.0;
        if (x == -1 && n % 2 != 0) return -1.0;

        long binForm = n;
        if (binForm < 0) {
            x = 1/x;
            binForm = -binForm;
        }

        double val = 1;
        while (binForm > 0) {
            if (binForm % 2 == 1) {
                val *= x;
            }
            x *= x;
            binForm /= 2;
        }
        return val;
    }
};