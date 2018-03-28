delimiter //
create procedure example()
	begin
		declare result int;
		declare c cursor for select empno from emp;
		declare exit handler for 1329
			begin
				select 'Åª¨ú§¹²¦';
				close c;	
			end;
		open c;
		loop
			fetch c into result;
			select result;
		end loop;
		
	end; //
delimiter ;