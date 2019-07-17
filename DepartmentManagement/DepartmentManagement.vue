<template>
  <div class='department-management'>
    <div class='business-label'>Department Management</div>
    <department-management-form formStyle='department-management-from' :formData.sync='form' />
    <el-row class='search-btn' :gutter='4'>
      <el-col :span='1'><el-button size='mini' @click='onSearch'>Search</el-button></el-col>
      <el-col :span='1'><el-button size='mini' @click='onReset'>Reset</el-button></el-col>
    </el-row>
    <el-table class='result-table' :data='table' size='mini' border>
      <el-table-column header-align='center' prop='departmentCode' label='Department Code' width='180' sortable>
      </el-table-column>
      <el-table-column prop='description' header-align='center' label='Description'>
      </el-table-column>
      <el-table-column header-align='center' label='Action' width='180'>
        <template slot-scope='scope'>
          <el-button size='mini' class='save-button' @click='handleDepartmentEdit(scope.row)'>Edit</el-button>
          <el-button size='mini' class='save-button' @click='handleDepartmentDelete(scope.row)'>Delete</el-button>
        </template>
      </el-table-column>
    </el-table>
    <el-pagination
      class='search-pagination'
      @size-change='handleSizeChange'
      @current-change='handleCurrentChange'
      :current-page='currentPage'
      :page-sizes='pageSizes'
      :page-size='pageSize'
      layout='total, sizes, prev, pager, next, jumper'
      :total='total'>
    </el-pagination>
    <el-dialog
      title='Department Edit'
      :visible.sync='editDialogVisible'
      width='30%'
      center>
      <department-management-form formStyle='department-management-from size-max' :formData.sync='tmpForm' />
      <span slot='footer' class='dialog-footer'>
        <el-button size='mini' class='save-button' @click='editDialogVisible = false'>Save</el-button>
        <el-button size='mini' class='save-button' @click='editDialogVisible = false'>Cancel</el-button>
      </span>
    </el-dialog>
    <el-dialog
      title='Department Delete'
      :visible.sync='deleteDialogVisible'
      width='30%'
      center>
      <span>Do you confirm to delete?</span>
      <span slot='footer' class='dialog-footer'>
        <el-button size='mini' class='save-button' @click='deleteDialogVisible = false'>Confirm</el-button>
        <el-button size='mini' class='save-button' @click='deleteDialogVisible = false'>Cancel</el-button>
      </span>
    </el-dialog>
  </div>
</template>

<script>
import DepartmentManagementForm from './DepartmentManagementForm';
export default {
  name: 'DepartmentManagement',
  components: {
    DepartmentManagementForm,
  },
  data () {
    return {
      form: {
        departmentCode: '',
        description: '',
      },
      tmpForm: {
        departmentCode: '',
        description: '',
      },
      table: [
        {
          departmentCode: '101',
          description: '2312312312',
        }, {
          departmentCode: '102',
          description: '2312312312',
        },
      ],
      editDialogVisible: false,
      deleteDialogVisible: false,
      total: 32,
      currentPage: 1,
      pageSizes: [15, 30, 45, 60],
      pageSize: 15,
    };
  },
  methods: {
    onSearch () {
      console.log(this.form);
    },
    onReset () {
      this.form.departmentCode = '';
      this.form.description = '';
    },
    handleDepartmentCodeChanged (val) {
      this.form.departmentCode = val;
    },
    handleDescriptionChanged (val) {
      this.form.description = val;
    },
    handleSizeChange (val) {
      this.pageSize = val;
    },
    handleCurrentChange (val) {
      this.currentPage = val;
    },
    handleDepartmentEdit (val) {
      this.tmpForm = val;
      this.editDialogVisible = true;
    },
    handleDepartmentDelete (val) {
      this.deleteDialogVisible = true;
    },
  },
};
</script>

<style lang='scss' scoped>
.department-management {
  border: 1px solid #6192ba;
  border-radius: 8px;
  margin-bottom: 20px;
  .business-label {
    border-top-left-radius: 8px;
    border-top-right-radius: 8px;
    height: 40px;
    color: #ffffff;
    font-size: 18px;
    background-color: #6192ba;
    line-height: 40px;
    text-align: left;
    padding-left: 20px;
  }
  .search-btn {
    padding-left: 10px;
    padding-bottom: 20px;
  }
  .result-table {
    margin: 10px;
    width: 98%;
  }
  .search-pagination {
    margin-bottom: 10px;
  }
}
</style>
