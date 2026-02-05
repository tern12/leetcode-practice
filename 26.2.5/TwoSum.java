[probrem]
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]



[answer]
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;　//.lengthは
        for (int i = 0; i < n - 1; i++) {　　//i < n - 1は、この問題では「2つの数字」のペアを探します。最後の1つ（一番右の要素）が1つ目の数字になってしまうと、そのペアとなる「2つ目の数字」が右側に存在しなくなってしまうからn-1をしている
            for (int j = i + 1; j < n ; j++) {　//j = i + 1 は、自分自身（i）と同じものを選ばないように、常に i の一歩右からスタート。i++,j++は、i （J）= i（ｊ）＋1　と同じ意味；ループの終わりに来るたびに i を 1 増やすことで、次の要素を調べに行くことができる。
                if (nums[i] + nums[j] == target){
                    return new int []{i,j};　　//newは
                }
            }
        }
        return new int []{};//答えがない時、「中身が空っぽ」の箱を返す（エラー防止）
    }
}

[メモ]
・ｎ:総数　全部で何個あるかという合計数
・i:一つ目の場所　ｊ;二つ目の場所
・i++,j++は、i （J）= i（ｊ）＋1　と同じ意味；ループの終わりに来るたびに i を 1 増やすことで、次の要素を調べに行くことができる。
・配列の添え字（インデックス）のルール: Javaの配列は 0 から始まる。要素数が n 個の場合、最後の番号は n - 1 になる
・配列の時は.lengthを使う。文字数の時は"Hello".length)を使う。リストの時.size)を使う。
・新しいものを使って返すときreturn new nums のように書く。すでにあるものを返すときはそのままnumsのように書く。

[完全理解できない部分]
i < n - 1 の理由　どういうときにn-1を使うのか。
new をどういうときに使うのか。そのまま返すときとはどういうときのことなのか。

21：00-22：50　分からないことが多すぎて時間がかかりすぎた。
