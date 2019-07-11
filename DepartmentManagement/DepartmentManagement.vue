<template>
  <div>
    <department-management-form />
    <department-management-table :table="table" />
    <el-dialog
      title="提示"
      :visible.sync="centerDialogVisible"
      width="30%"
      center>
      <span>需要注意的是内容是默认不居中的</span>
      <span slot="footer" class="dialog-footer">
        <el-button @click="centerDialogVisible = false">取 消</el-button>
        <el-button type="primary" @click="centerDialogVisible = false">确 定</el-button>
      </span>
    </el-dialog>
  </div>
</template>

<script>
import DepartmentManagementForm from './DepartmentManagementForm';
import DepartmentManagementTable from './DepartmentManagementTable';
export default {
  name: 'DepartmentManagement',
  components: {
    DepartmentManagementForm,
    DepartmentManagementTable
  },
  data () {
    return {
      form: {
        departmentCode: '',
        description: ''
      },
      table: [
        {
          departmentCode: '101',
          description: '2312312312'
        }, {
          departmentCode: '102',
          description: '2312312312'
        }
      ],
      centerDialogVisible: true,
    };
  },
};
</script>
