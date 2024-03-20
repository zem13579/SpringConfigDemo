

CREATE TABLE properties
(
    id          NUMBER(11) NOT NULL ,
    key         VARCHAR2(50)  DEFAULT NULL,
    value       VARCHAR2(500) DEFAULT NULL,
    application VARCHAR2(50)  DEFAULT NULL,
    profile     VARCHAR2(50)  DEFAULT NULL,
    label       VARCHAR2(50)  DEFAULT NULL,
    remark      VARCHAR2(50)   DEFAULT NULL,
    PRIMARY KEY (id)
);

INSERT INTO TESTLU.PROPERTIES VALUES (1, 'server.port', '8093', 'svcA', 'pro', 'v0.0.1', '应用端口');
INSERT INTO TESTLU.PROPERTIES VALUES (2, 'profile', 'nihao', 'svcA', 'pro', 'v0.0.1', '测试用');
INSERT INTO TESTLU.PROPERTIES VALUES (3, 'envTag', 'formjdbc', 'svcA', 'pro', 'v0.0.1', '测试用');

select * from properties;

SELECT t.KEY,t.VALUE FROM TESTLU.PROPERTIES t WHERE t.APPLICATION=? AND t.PROFILE=? AND t.LABEL=?;

SELECT KEY,VALUE FROM TESTLU.PROPERTIES t WHERE t.APPLICATION='svcA' AND PROFILE='pro' AND LABEL='v0.0.1';

SELECT * FROM v$sql
where SQL_TEXT like '%TESTLU.PROPERTIES%'
ORDER BY LAST_ACTIVE_TIME DESC;