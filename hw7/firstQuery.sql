SELECT COUNT(profile.profile_id)
FROM profile FULL JOIN post ON profile.profile_id = post.profile_id
WHERE post.post_id IS NULL