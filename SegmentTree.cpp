// https://codeforces.com/blog/entry/18051
class SegmentTree{
    public:
    int n;  // array size
    vector<int> t;

    void build() {  // build the tree
      for (int i = n - 1; i > 0; --i) t[i] = min(t[i<<1] , t[i<<1|1]);
    }

    void modify(int p, int value) {  // set value at position p
      for (t[p += n] = value; p > 1; p >>= 1) t[p>>1] = min(t[p], t[p^1]);
    }

    int query(int l, int r) {  // sum on interval [l, r)
      int res = INT_MAX;
      for (l += n, r += n; l < r; l >>= 1, r >>= 1) {
        if (l&1) res = min(res,t[l++]);
        if (r&1) res = min(t[--r], res);
      }
      return res==INT_MAX?0:res;
    }
}; 

