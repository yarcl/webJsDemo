/*
  MySql版sql脚本
 */
CREATE TABLE
    RAZOR_CHANNEL_PRODUCT
    (
        CP_ID VARCHAR(20) NOT NULL,
        USER_ID VARCHAR(20) NOT NULL,
        PRODUCT_ID VARCHAR(20) NOT NULL,
        CHANNEL_ID VARCHAR(20) NOT NULL,
        PRODUCTKEY VARCHAR(50) DEFAULT '' NOT NULL,
        FILEURL VARCHAR(255) DEFAULT '' NOT NULL,
        VERSIONCODE VARCHAR(50) DEFAULT '' NOT NULL,
        VERSIONNAME VARCHAR(50) DEFAULT '' NOT NULL,
        DESCRIPTION VARCHAR(5000) DEFAULT NULL,
        MAN INTEGER DEFAULT 0 NOT NULL,
        DATE datetime DEFAULT '1000-01-01-00.00.00' NOT NULL,
        PRIMARY KEY (CP_ID)
    );

CREATE TABLE
    RAZOR_USER2PRODUCT
    (
        ID VARCHAR(20) NOT NULL,
        USER_ID VARCHAR(20) NOT NULL,
        PRODUCT_ID VARCHAR(20) NOT NULL,
        PRIMARY KEY (ID)
    );

CREATE TABLE
    RAZOR_PRODUCT
    (
        ID VARCHAR(20) NOT NULL,
        NAME VARCHAR(50) NOT NULL,
        DESCRIPTION VARCHAR(5000) NOT NULL,
        DATE datetime DEFAULT '1000-01-01-00.00.00' NOT NULL,
        USER_ID VARCHAR(20) NOT NULL,
        CHANNEL_COUNT INTEGER DEFAULT 0 NOT NULL,
        PRODUCT_KEY VARCHAR(50) DEFAULT NULL,
        PRODUCT_PLATFORM VARCHAR(20) NOT NULL,
        CATEGORY VARCHAR(20) NOT NULL,
        ACTIVE INTEGER DEFAULT 1 NOT NULL,
        PACKAGE_NAME VARCHAR(100),
        PRIMARY KEY (ID)
    );

CREATE TABLE
    RAZOR_EVENT_DEFINATION
    (
        EVENT_ID VARCHAR(20) NOT NULL,
        EVENT_IDENTIFIER VARCHAR(50) NOT NULL,
        PRODUCTKEY VARCHAR(50) DEFAULT '' NOT NULL,
        EVENT_NAME VARCHAR(50) NOT NULL,
        CHANNEL_ID VARCHAR(20) NOT NULL,
        PRODUCT_ID VARCHAR(20) NOT NULL,
        USER_ID VARCHAR(20) NOT NULL,
        CREATE_DATE datetime DEFAULT '1000-01-01-00.00.00' NOT NULL,
        ACTIVE INTEGER DEFAULT '1' NOT NULL,
        PRIMARY KEY (EVENT_ID)
    );

CREATE TABLE
    RAZOR_EVENT_TRACK
    (
        ER_ID VARCHAR(40) NOT NULL,
        EVENT_ID VARCHAR(40),
        EVENT_PATH VARCHAR(512),
        ACTIVITY VARCHAR(512),
        VERSION VARCHAR(20),
        APPKEY VARCHAR(40),
        PRODUCT_ID VARCHAR(20),
        PRIMARY KEY (ER_ID)
    );