curl http://admin:admin@localhost:8080/v2/service_instances/1234 -d '{
  "service_id":        "074B2280-C5CC-4C9F-92E3-8042EB5681FE",
  "plan_id":           "47B53538-F8EE-47B5-9E98-A3F2CECBEE07",
  "organization_guid": "org-1",
  "space_guid":        "space-1"
}' -X PUT -H "Content-Type:application/json"
echo

