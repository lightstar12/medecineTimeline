const $goInsertDataBtn = document.querySelector(".goInsertDataBtn");
const $goViewDataBtn = document.querySelector(".goViewDataBtn");
const $goDeleteDataBtn = document.querySelector(".goDeleteDataBtn");
const $goUpdateDataBtn = document.querySelector(".goUpdateDataBtn");
// ============== 버튼 지정 변수 ==============

const insertDataPage = "insertDataForm.jsp";
const viewDataPage = "viewDataForm.jsp";
const deleteDataPage = "deleteDataForm.jsp";
const updateDataPage = "updateDataForm.jsp";
// ============== 주소  변수 ==============

const goInsertDataPage = function() {
  window.location.href = insertDataPage;
}

const goViewDataPage = function() {
  window.location.href = viewDataPage;
}

const goDeleteDataPage = function() {
  window.location.href = deleteDataPage;
}

const goUpdateDataPage = function() {
  window.location.href = updateDataPage;
}

// ============== 함수 내포 변수 ==============

$goInsertDataBtn.addEventListener("click", goInsertDataPage);
$goViewDataBtn.addEventListener("click", goViewDataPage);
$goDeleteDataBtn.addEventListener("click", goDeleteDataPage);
$goUpdateDataBtn.addEventListener("click", goUpdateDataPage);