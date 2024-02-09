--Part 1
-- job table
-- id - int
-- employer - varchar 255
-- name - varchar 255
-- skills - varchar 255
--Part 2
select name from employer
where location = "St. Louis City";
--Part 3
drop table job;
--Part 4
select * from skill
left join job_skills on skill.id = job_skills.skills_id
where job_skills.jobs_id is not null
order by name asc;