-- 코드를 입력하세요
SELECT BOOK_ID,AUTHOR_NAME,date_format(PUBLISHED_DATE,'%Y-%m-%d')
FROM BOOK B JOIN AUTHOR A ON B.AUTHOR_ID = A.AUTHOR_ID
WHERE CATEGORY = '경제'
ORDER BY PUBLISHED_DATE;
