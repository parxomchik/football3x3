insert into news values (1,'News 1','Shord description 1', 'Shot mazafaka', LOAD_FILE('c:/Downloads/2.jpg'), NOW());

insert into teams values (1,'INVESTOR', 'BU', 'bu.com', 'Zermon','+380672693543', 'bu@gmail.com', load_file('c:/Downloads/mops.jpg'));
insert into players(name,surname,role,captain,team_id) values ('Max', 'Mad', 'forward',true,1);
insert into players(name,surname,role,captain,team_id) values ('Max', 'Awesome', 'defender',false,1);
insert into players(name,surname,role,captain,team_id) values ('Max', 'Lazy', 'goalkeeper',false,1);