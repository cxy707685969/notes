## DAL

```C#
using System;
using System.Data;
using System.Text;
using System.Data.SqlClient;
using OOCL.GLTMS.Common;
using OOCL.GLTMS.Entity;

namespace OOCL.GLTMS.DAL
{
    public  class CTExpenseTypeAndAccountCodeDAL
    {
        public DataSet TravelTypeList(SqlConnection conn)
        {
            StringBuilder strSql = new StringBuilder();
            strSql.Append("select distinct(TravelType) FROM CT_Expense_Type_And_Account_Code where [TravelType] is not null and [TravelType]<>''");

            return DbHelperSQL.Query(conn, strSql.ToString());
        }

    }
}
```
## BLL

```C#
using System;
using System.Data;
using System.Configuration;
using System.Collections;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Web.UI.HtmlControls;
using OOCL.GLTMS.BLL;

namespace OOCL.GLTMS.Web.Layouts.Main
{
    public partial class TestTravelTypeDropdown : System.Web.UI.Page
    {
        private TestTravelTypeBLL bll = new TestTravelTypeBLL();
        void Page_Load(Object sender, EventArgs e)
        {
            
            // Load data for the DropDownList control only once, when the 
            // page is first loaded.
            if (!IsPostBack)
            {
                DataTable dataTable = bll.TravelTypeList();
                this.TravelTypeList.Items.Add(new ListItem("please select", ""));
                for (int i = 0; i < dataTable.Rows.Count; i++)
                {
                    this.TravelTypeList.Items.Add(new ListItem(dataTable.Rows[i]["TravelType"].ToString(), dataTable.Rows[i]["TravelType"].ToString()));
                }
            }
        }
    }
}

```

## aspx
```c#
<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="TestTravelTypeDropdown.aspx.cs" Inherits="OOCL.GLTMS.Web.Layouts.Main.TestTravelTypeDropdown" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
   <script runat="server" >
       
   </script>
  
<head id="Head1" runat="server">
    <title> DropDownList Data Binding Example </title>
</head>
<body>

   <form id="form1" runat="server">
      <table cellpadding="5">
         <tr>
            <td>
              Travel Type:
            </td>
         </tr>
         <tr>
            <td>
               <asp:DropDownList id="TravelTypeList"
                    AutoPostBack="True"
                    runat="server"/>
            </td>
         </tr>
      </table>   
   </form>
</body>
</html>
```

## aspx.cs

```c#
using System;
using System.Data;
using System.Configuration;
using System.Collections;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Web.UI.HtmlControls;
using OOCL.GLTMS.BLL;

namespace OOCL.GLTMS.Web.Layouts.Main
{
    public partial class TestTravelTypeDropdown : System.Web.UI.Page
    {
        private TestTravelTypeBLL bll = new TestTravelTypeBLL();
        void Page_Load(Object sender, EventArgs e)
        {
            
            // Load data for the DropDownList control only once, when the 
            // page is first loaded.
            if (!IsPostBack)
            {
                DataTable dataTable = bll.TravelTypeList();
                this.TravelTypeList.Items.Add(new ListItem("please select", ""));
                for (int i = 0; i < dataTable.Rows.Count; i++)
                {
                    this.TravelTypeList.Items.Add(new ListItem(dataTable.Rows[i]["TravelType"].ToString(), dataTable.Rows[i]["TravelType"].ToString()));
                }
            }
        }
    }
}
```

