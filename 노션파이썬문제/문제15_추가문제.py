# 문자열 word가 주어질 때,
# 해당 문자열에서 a의 모든 위치(index)를 출력해주세요.
# find() index() 메서드 사용 금지

word = 'HappyHacking'
count = 0

for i in word:
    count += 1
    if i == 'a':
        print(count, end =" ")


# 강사님 풀이
word = 'banana'
result = []
for idx in range(len(word)):
    if word[idx] == 'a':
        result.append(idx)
print(result)


word = 'banana'
result = []
for idx in range(len(word)):
    if word[idx] == 'a':
        if word[idx] == 'a':
            print(idx, end ='')