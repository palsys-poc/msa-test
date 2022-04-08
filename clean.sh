oc delete deploy msa-test-git
oc delete svc msa-test-git
oc delete is msa-test-git
oc delete route msa-test-git
oc delete bc msa-test-git
oc delete secret msa-test-git-generic-webhook-secret
oc delete secret msa-test-git-github-webhook-secret
echo 'status ok'
