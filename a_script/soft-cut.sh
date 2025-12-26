#!/usr/bin/env bash
set -e

VERSION=$1

if [ -z "$VERSION" ]; then
  echo "Usage: ./soft-cut.sh 2025.01"
  exit 1
fi

git checkout develop
git pull origin develop

git checkout -b release/$VERSION
git push -u origin release/$VERSION

echo "✅ Soft cut created: release/$VERSION"
