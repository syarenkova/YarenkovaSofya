SELECT post.post_id
FROM post FULL JOIN comment ON post.post_id = comment.post_id
WHERE LENGTH(post.content) > 20 AND post.title ~ '^[0-9]'
GROUP BY post.post_id HAVING COUNT(comment.comment_id) = 2
ORDER BY post.post_id