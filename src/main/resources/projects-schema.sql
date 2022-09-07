DROP TABLE IF EXISTS project;
DROP TABLE IF EXISTS step;
DROP TABLE IF EXISTS material;
DROP TABLE IF EXISTS category;
DROP TABLE IF EXISTS project_category;


CREATE TABLE project (
	project_id INT NOT NULL,
	project_name VARCHAR(128) NOT NULL,
	estimated_hours TIME,
	actual_hours TIME,
	difficulty INT NOT NULL,
	notes TEXT
);
CREATE TABLE material (
	material_id INT NOT NULL,
	project_id INT NOT NULL,
	material_name VARCHAR(128) NOT NULL,
	num_required INT NULL,
	cost DECIMAL(7,2)
);
CREATE TABLE step (
	step_id INT NOT NULL,
	project_id INT NOT NULL,
	step_text TEXT NOT NULL,
	step_order INT NOT NULL
);
CREATE TABLE category (
	category_id INT NOT NULL,
	category_name VARCHAR(128) NOT NULL
);
CREATE TABLE project_category (
	project_id INT NOT NULL,
	category_id INT NOT NULL
);