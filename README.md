# Database Connection & Querying Guide

This guide explains how to connect to, view, and manage your hosted PostgreSQL database data.

## 1. Database Connection Credentials

Use these details to configure your SQL clients (e.g., DBeaver, pgAdmin, TablePlus):

- **Host / Server**: `pooled.db.prisma.io`
- **Port**: `5432`
- **Database Name**: `postgres`
- **Username**: `2e868943c4a1b509d44a637e4e8b24029a5f75ba3997aa43ccf98699e32dc30f`
- **Password**: `sk_Da2oX_48zJfSWwTsYGWQV`
- **SSL Mode**: `require` (Crucial: Connection will fail if SSL is not active or set to require)

---

## 2. Tools to Check & Query Data

### Option A: DBeaver (Recommended GUI Tool)
1. Download and install [DBeaver Community Edition](https://dbeaver.io/download/).
2. Create a new connection: Click the **Plug** icon (New Connection) and select **PostgreSQL**.
3. Fill in the connection settings:
   - **Host**: `pooled.db.prisma.io`
   - **Database**: `postgres`
   - **Username**: `2e868943c4a1b509d44a637e4e8b24029a5f75ba3997aa43ccf98699e32dc30f`
   - **Password**: `sk_Da2oX_48zJfSWwTsYGWQV`
4. Go to the **SSL** tab:
   - Check **Use SSL**.
   - Set **SSL Mode** to `require`.
5. Click **Test Connection** to download driver files and verify connectivity, then click **Finish**.
6. Open **SQL Editor** (Ctrl+Alt+G) to execute your queries or browse tables dynamically in the Database Navigator.

---

### Option B: pgAdmin
1. Download and install [pgAdmin](https://www.pgadmin.org/download/).
2. Right-click **Servers** > **Register** > **Server...**.
3. Under the **General** tab, name the server connection.
4. Under the **Connection** tab, configure:
   - **Host name/address**: `pooled.db.prisma.io`
   - **Maintenance database**: `postgres`
   - **Username**: `2e868943c4a1b509d44a637e4e8b24029a5f75ba3997aa43ccf98699e32dc30f`
   - **Password**: `sk_Da2oX_48zJfSWwTsYGWQV`
5. Under the **Parameters** tab:
   - Set **SSL mode** to `require`.
6. Click **Save**.

---

### Option C: CLI Tool (`psql`)
If you have PostgreSQL installed locally on your command line, connect using the connection URI string:
```bash
psql "postgres://2e868943c4a1b509d44a637e4e8b24029a5f75ba3997aa43ccf98699e32dc30f:sk_Da2oX_48zJfSWwTsYGWQV@pooled.db.prisma.io:5432/postgres?sslmode=require"
```

---

## 3. Seed / Schema Initialization

To initialize or reset tables and seed data, open your SQL editor in the chosen client and execute the contents of the root schema file:
- Schema and seed query file: [schema.sql](file:///c:/Users/user/Documents/Projects/employee-management/schema.sql)
