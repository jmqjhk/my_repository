declare
  i number;
  millisecond number;
  standtime date;
begin
  select to_date('1970-01-01 08:00:00', 'yyyy-mm-dd hh24:mi:ss') into standtime from dual;
  select to_number(sysdate-standtime)*24*60*60*1000 into millisecond from dual;
  
  for i in 0..10000 loop
    -- 间隔5分钟
    millisecond := millisecond + (1000*60*5);
    -- CPU使用率
    insert into EMS_PARAM_CPU_MEM values(i*3+1,0,1,trunc(dbms_random.value(1,100)),millisecond/(1000*60*60*24)+standtime);
    -- MEM占用值
    insert into EMS_PARAM_CPU_MEM values(i*3+2,0,20,trunc(dbms_random.value(1,2048)),millisecond/(1000*60*60*24)+standtime);
    -- MEM总值
    insert into EMS_PARAM_CPU_MEM values(i*3+3,0,21,'2048',millisecond/(1000*60*60*24)+standtime);
  end loop;
end;